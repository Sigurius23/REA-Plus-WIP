.class public final Lf91/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u0010\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0008R\u001a\u0010\u0011\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lf91/e;",
        "",
        "<init>",
        "()V",
        "Lvf3/c;",
        "b",
        "Lvf3/c;",
        "c",
        "()Lvf3/c;",
        "GALLERY_VIEW_MODEL",
        "e",
        "MENU_VIEW_MODEL",
        "d",
        "a",
        "DOMAIN_INTERACTOR",
        "f",
        "VIEW_REDUCER",
        "GALLERY_ITEM_FACTORY",
        "g",
        "MENU_ITEM_FACTORY",
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


# static fields
.field public static final a:Lf91/e;

.field private static final b:Lvf3/c;

.field private static final c:Lvf3/c;

.field private static final d:Lvf3/c;

.field private static final e:Lvf3/c;

.field private static final f:Lvf3/c;

.field private static final g:Lvf3/c;

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf91/e;

    invoke-direct {v0}, Lf91/e;-><init>()V

    sput-object v0, Lf91/e;->a:Lf91/e;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_gallery_view_model"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->b:Lvf3/c;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_menu_view_model"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->c:Lvf3/c;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_domain_interactor"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->d:Lvf3/c;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_view_reducer"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->e:Lvf3/c;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_gallery_item_factory"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->f:Lvf3/c;

    new-instance v0, Lvf3/c;

    const-string v1, "design_showcase_menu_item_factory"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf91/e;->g:Lvf3/c;

    const/16 v0, 0x8

    sput v0, Lf91/e;->h:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->d:Lvf3/c;

    return-object v0
.end method

.method public final b()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->f:Lvf3/c;

    return-object v0
.end method

.method public final c()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->b:Lvf3/c;

    return-object v0
.end method

.method public final d()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->g:Lvf3/c;

    return-object v0
.end method

.method public final e()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->c:Lvf3/c;

    return-object v0
.end method

.method public final f()Lvf3/c;
    .locals 1

    sget-object v0, Lf91/e;->e:Lvf3/c;

    return-object v0
.end method
