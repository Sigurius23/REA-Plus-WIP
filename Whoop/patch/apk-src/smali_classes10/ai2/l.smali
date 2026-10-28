.class public abstract Lai2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Loh2/a;",
        "Lcu0/c;",
        "c",
        "(Loh2/a;)Lcu0/c;",
        "",
        "binaryFlags",
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;",
        "d",
        "(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;",
        "strap-history-sync_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Loh2/a;)Lcu0/c;
    .locals 0

    invoke-static {p0}, Lai2/l;->c(Loh2/a;)Lcu0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;
    .locals 0

    invoke-static {p0, p1}, Lai2/l;->d(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Loh2/a;)Lcu0/c;
    .locals 7

    new-instance v0, Lcu0/c;

    invoke-virtual {p0}, Loh2/a;->d()Loh2/c;

    move-result-object v1

    const-string v2, ""

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    move-object v1, v2

    :cond_1
    invoke-virtual {p0}, Loh2/a;->c()Loh2/b;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    move-object v3, v2

    :cond_3
    invoke-virtual {p0}, Loh2/a;->e()Loh2/e;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Loh2/a;->f()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    move-object v2, v5

    :goto_1
    invoke-virtual {p0}, Loh2/a;->g()B

    move-result v5

    move-object v6, v4

    move-object v4, v2

    move-object v2, v3

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcu0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method private static final d(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;
    .locals 7

    new-instance v0, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;

    invoke-virtual {p0}, Loh2/a;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-virtual {p0}, Loh2/a;->d()Loh2/c;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    move-object v3, v2

    :cond_2
    invoke-virtual {p0}, Loh2/a;->c()Loh2/b;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v4}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    move-object v4, v2

    :cond_4
    invoke-virtual {p0}, Loh2/a;->e()Loh2/e;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    move-object v2, v5

    :cond_6
    :goto_0
    invoke-virtual {p0}, Loh2/a;->g()B

    move-result v5

    move-object v6, v4

    move-object v4, v2

    move-object v2, v3

    move-object v3, v6

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-object v0
.end method
