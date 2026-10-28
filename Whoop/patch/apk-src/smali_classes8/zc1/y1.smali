.class public final Lzc1/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzc1/y1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgd1/a<",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\rj\u0008\u0012\u0004\u0012\u00020\u0002`\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lzc1/y1;",
        "Lgd1/a;",
        "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
        "<init>",
        "()V",
        "itemType",
        "",
        "Lm91/u;",
        "c",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Ljava/util/List;",
        "Lid1/a;",
        "d",
        "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lid1/a;",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "a",
        "Ljava/util/HashSet;",
        "iconsSet",
        "design-showcase_release"
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
.field private final a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_ACTION:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_ACTIVITIES:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_CONNECTIONS:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v3, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_GENERAL:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_GROWTH:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_LOGO:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_NAVIGATION:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_RECOVERY:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_SLEEP:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_STRAIN:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_STRAP:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_ICON_VARIOUS:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    filled-new-array/range {v0 .. v11}, [Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->w([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lzc1/y1;->a:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lid1/a;
    .locals 0

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    invoke-virtual {p0, p1}, Lzc1/y1;->d(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lid1/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    check-cast p1, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    invoke-virtual {p0, p1}, Lzc1/y1;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const-string v0, "itemType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzc1/y1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {}, Lzc1/y5;->c()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, Lzc1/y5;->b()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, Lzc1/y5;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, Lzc1/u;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, Lzc1/u;->k()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, Lzc1/u;->j()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, Lzc1/u;->i()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, Lzc1/u;->h()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, Lzc1/u;->g()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {}, Lzc1/u;->f()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {}, Lzc1/u;->e()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {}, Lzc1/u;->d()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {}, Lzc1/u;->c()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {}, Lzc1/u;->b()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {}, Lzc1/u;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {}, Lzc1/v;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {}, Lzc1/t;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lid1/a;
    .locals 1

    const-string v0, "itemType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzc1/y1;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lid1/a$a;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lid1/a$a;-><init>(I)V

    return-object p1

    :cond_0
    sget-object v0, Lzc1/y1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_1

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    sget-object p1, Lid1/a$b;->a:Lid1/a$b;

    return-object p1

    :cond_1
    new-instance p1, Lid1/a$a;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lid1/a$a;-><init>(I)V

    return-object p1
.end method
