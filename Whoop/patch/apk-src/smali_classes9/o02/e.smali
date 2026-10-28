.class public final Lo02/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R:\u0010\u0017\u001a\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00080\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lo02/e;",
        "",
        "<init>",
        "()V",
        "Lj93/d;",
        "itemClass",
        "Lkotlin/Function1;",
        "Lj02/c;",
        "Lcom/whoop/navigation/reducer/NavigationScreenConfig;",
        "config",
        "Ll83/a0;",
        "a",
        "(Lj93/d;Lkotlin/jvm/functions/Function1;)V",
        "",
        "Lo02/d;",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "mappers",
        "",
        "b",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "configs",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo02/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo02/e;->a:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lo02/e;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "itemClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo02/e;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo02/e;->b:Ljava/util/Map;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo02/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo02/e;->a:Ljava/util/List;

    return-object v0
.end method
