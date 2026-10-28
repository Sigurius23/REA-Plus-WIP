.class public final Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;
.super Lcom/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException;
.source "SourceFile"


# instance fields
.field public final y:I


# direct methods
.method public constructor <init>(ILcom/google/android/exoplayer2/upstream/DataSourceException;Ljava/util/Map;)V
    .locals 1

    const/16 p3, 0x1a

    const-string v0, "Response code: "

    invoke-static {p3, p1, v0}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const/16 v0, 0x7d4

    invoke-direct {p0, p2, p3, v0}, Lcom/google/android/exoplayer2/upstream/DataSourceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;I)V

    iput p1, p0, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;->y:I

    return-void
.end method
