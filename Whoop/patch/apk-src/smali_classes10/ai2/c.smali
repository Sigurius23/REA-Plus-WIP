.class public abstract Lai2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Llt0/f;",
        "Lhk0/e;",
        "c",
        "(Llt0/f;)Lhk0/e;",
        "Loh2/a;",
        "",
        "binaryFlags",
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "d",
        "(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
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
.method public static final synthetic a(Llt0/f;)Lhk0/e;
    .locals 0

    invoke-static {p0}, Lai2/c;->c(Llt0/f;)Lhk0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;
    .locals 0

    invoke-static {p0, p1}, Lai2/c;->d(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llt0/f;)Lhk0/e;
    .locals 3

    instance-of v0, p0, Lhk0/e;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lhk0/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Llt0/f;->g()Llt0/g;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a Rev2 data settings packet, got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with format revision "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final d(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;
    .locals 7

    new-instance v0, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

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

    invoke-direct/range {v0 .. v6}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-object v0
.end method
