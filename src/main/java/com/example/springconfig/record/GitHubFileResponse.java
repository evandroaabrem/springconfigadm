package com.example.springconfig.record;

public record GitHubFileResponse(
        String name,
        String path,
        String sha,
        String content,
        String encoding
) {}

