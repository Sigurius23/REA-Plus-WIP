.class public abstract Lob1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;",
        "Lyz0/c;",
        "f",
        "(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "avatarPillMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo72/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lob1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;
    .locals 0

    invoke-static {p0}, Lob1/a;->d(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lob1/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo72/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lob1/a$a;

    invoke-direct {v2, v0}, Lob1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lob1/a;->f(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lob1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;)Lyz0/c;
    .locals 8

    new-instance v0, Lyz0/c;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;->getImage()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3}, Ldc/b;->d(Lx81/d;)I

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/avatarpill/AvatarPillModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lyz0/c;-><init>(Lkd1/o;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0
.end method
