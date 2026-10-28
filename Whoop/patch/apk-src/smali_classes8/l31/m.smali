.class public abstract Ll31/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0003\u001a\u0004\u0008\u0008\u0010\u0005\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0005\"\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "Lsz0/n1;",
        "a",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "verticalStatWithoutTrendWithIcon",
        "b",
        "d",
        "verticalStatWithoutTrendWithOutIcon",
        "verticalStatWithTrendWithIcon",
        "verticalStatWithTrendWithoutIcon",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->u()I

    move-result v0

    const-string v1, "123"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v12, "STAT TITLE"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v2, Lsz0/n1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v10, 0x41

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lsz0/n1;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/g1;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/m;->a:Ljava/util/List;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v2, Lsz0/n1;

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v11}, Lsz0/n1;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/g1;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/m;->b:Ljava/util/List;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->u()I

    move-result v0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v13, Lhy0/b2;->POSITIVE:Lhy0/b2;

    const-string v14, "8% past month"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v7, Lsz0/g1;

    invoke-direct {v7, v2, v13}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    new-instance v2, Lsz0/n1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct/range {v2 .. v11}, Lsz0/n1;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/g1;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/m;->c:Ljava/util/List;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v7, Lsz0/g1;

    invoke-direct {v7, v0, v13}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    new-instance v2, Lsz0/n1;

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v11}, Lsz0/n1;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/g1;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/m;->d:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/m;->c:Ljava/util/List;

    return-object v0
.end method

.method public static final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/m;->d:Ljava/util/List;

    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/m;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/n1;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/m;->b:Ljava/util/List;

    return-object v0
.end method
