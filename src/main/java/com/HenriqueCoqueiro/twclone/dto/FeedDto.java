package com.HenriqueCoqueiro.twclone.dto;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedItem, int page,
                      int pageSize,
                      int totalPages,
                      long totalElements) {
}
