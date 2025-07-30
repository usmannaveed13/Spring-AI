package com.ai.SpringAiDemo;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private final OpenAiImageModel oPenAiImageModel;

    public ImageService(OpenAiImageModel oPenAiImageModel) {
        this.oPenAiImageModel = oPenAiImageModel;
    }

    public ImageResponse generateImage(String prompt,
                                       String quality,
                                       int n,
                                       int width,
                                       int height) {
//        ImageResponse imageResponse = oPenAiImageModel.call(
//                new ImagePrompt(prompt));


//        ImageResponse imageResponse = oPenAiImageModel.call(
//                new ImagePrompt(prompt,
//                        OpenAiImageOptions.builder()
//                                .quality("hd")
//                                .N(4)
//                                .height(1024)
//                                .width(1024).build())
//        );

        ImageResponse imageResponse = oPenAiImageModel.call(
                new ImagePrompt(prompt,
                        OpenAiImageOptions.builder()
                                .quality(quality)
                                .N(n)
                                .height(height)
                                .width(width).build())
        );
        return imageResponse;
    }
}
