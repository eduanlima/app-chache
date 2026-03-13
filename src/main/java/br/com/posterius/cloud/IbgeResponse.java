package br.com.posterius.cloud;

import java.io.Serializable;

public record IbgeResponse(int id, String nome) implements Serializable {
}