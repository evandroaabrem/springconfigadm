package com.example.springconfig.record;

public record GitHubUpdateFileRequest(
        String message,
        String content,
        String sha
) {}