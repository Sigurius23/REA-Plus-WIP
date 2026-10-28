.class public Landroidx/media3/datasource/DataSourceException;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final w:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 2
    iput p1, p0, Landroidx/media3/datasource/DataSourceException;->w:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/Exception;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 4
    iput p1, p0, Landroidx/media3/datasource/DataSourceException;->w:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iput p3, p0, Landroidx/media3/datasource/DataSourceException;->w:I

    return-void
.end method

.method public static a(Ljava/io/IOException;)Z
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    instance-of v0, p0, Landroidx/media3/datasource/DataSourceException;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Landroidx/media3/datasource/DataSourceException;

    iget v0, v0, Landroidx/media3/datasource/DataSourceException;->w:I

    const/16 v1, 0x7d8

    if-ne v0, v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
