package com.swapi.films.controller;

import com.swapi.films.MockDomain;
import com.swapi.films.mapper.FilmsMapper;
import com.swapi.films.service.impl.FilmsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilmsControllerTest {
    @Mock
    private FilmsServiceImpl service = mock(FilmsServiceImpl.class);
    @Mock
    private FilmsController controller = mock(FilmsController.class);
    @Mock
    private FilmsMapper mapper = mock(FilmsMapper.class);
    MockDomain mockDomain;



//    @Test
//    public void testarFilmsGetOK(){
//
//        when(this.service.listarTodosOsFilmes())
//                .thenReturn(mockDomain.filmsListMock());
//        when(this.mapper.listarFilmes(ArgumentMatchers.any()))
//                .thenReturn(mockDomain.filmsListModelsMock());
//        ResponseEntity<List<com.swapi.films.models.Films>> listResponseEntity = controller.filmsGet();
//
//        Assertions.assertEquals(HttpStatus.OK, listResponseEntity.getStatusCode());
//    }
//
//    @Test
//    public void testarFilmsGetNotFound(){
//
//        when(this.service.listarTodosOsFilmes())
//                .thenReturn(mockDomain.filmsListMock());
//        ResponseEntity<List<com.swapi.films.models.Films>> listResponseEntity = controller.filmsGet();
//
//        Assertions.assertEquals(HttpStatus.NOT_FOUND, listResponseEntity.getStatusCode());
//    }

}
