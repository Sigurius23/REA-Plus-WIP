.class public final enum Ljx1/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljx1/t;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B7\u0008\u0002\u0012\u001a\u0008\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ljx1/t;",
        "",
        "",
        "Ll83/k;",
        "",
        "Li2/x;",
        "backgroundColors",
        "alpha",
        "Li91/a;",
        "buttonBackground",
        "<init>",
        "(Ljava/lang/String;I[Ll83/k;FLi91/a;)V",
        "[Ll83/k;",
        "getBackgroundColors",
        "()[Ll83/k;",
        "F",
        "getAlpha",
        "()F",
        "Li91/a;",
        "getButtonBackground",
        "()Li91/a;",
        "ONE",
        "PEAK",
        "LIFE",
        "DISABLED",
        "membership_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ljx1/t;

.field public static final enum DISABLED:Ljx1/t;

.field public static final enum LIFE:Ljx1/t;

.field public static final enum ONE:Ljx1/t;

.field public static final enum PEAK:Ljx1/t;


# instance fields
.field private final alpha:F

.field private final backgroundColors:[Ll83/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/k;"
        }
    .end annotation
.end field

.field private final buttonBackground:Li91/a;


# direct methods
.method private static final synthetic $values()[Ljx1/t;
    .locals 4

    sget-object v0, Ljx1/t;->ONE:Ljx1/t;

    sget-object v1, Ljx1/t;->PEAK:Ljx1/t;

    sget-object v2, Ljx1/t;->LIFE:Ljx1/t;

    sget-object v3, Ljx1/t;->DISABLED:Ljx1/t;

    filled-new-array {v0, v1, v2, v3}, [Ljx1/t;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 25

    new-instance v0, Ljx1/t;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const v1, 0xffffff

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const v2, 0x1affffff

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v3

    sget-object v1, Ljx1/t$a;->w:Ljx1/t$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v5

    const-string v1, "ONE"

    const/4 v2, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v5}, Ljx1/t;-><init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V

    sput-object v0, Ljx1/t;->ONE:Ljx1/t;

    new-instance v8, Ljx1/t;

    const-wide v0, 0xffadc2cdL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f4ccccd    # 0.8f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-wide v2, 0x80479ac2L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x479ac2

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2, v3}, [Ll83/k;

    move-result-object v11

    sget-object v0, Ljx1/t$b;->w:Ljx1/t$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v13

    const-string v9, "PEAK"

    const/4 v10, 0x1

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-direct/range {v8 .. v13}, Ljx1/t;-><init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V

    sput-object v8, Ljx1/t;->PEAK:Ljx1/t;

    new-instance v9, Ljx1/t;

    const-wide v2, 0xffbac2adL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v0, Li2/x;

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3ecccccd    # 0.4f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-wide v15, 0x80c5dfd9L

    invoke-static/range {v15 .. v16}, Li2/w0;->e(J)J

    move-result-wide v10

    new-instance v5, Li2/x;

    invoke-direct {v5, v10, v11}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v17, 0x80bdb0beL

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v10

    new-instance v5, Li2/x;

    invoke-direct {v5, v10, v11}, Li2/x;-><init>(J)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, 0xbdb0be

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v11

    new-instance v13, Li2/x;

    invoke-direct {v13, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v7, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v8, v10, v11}, [Ll83/k;

    move-result-object v12

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v4

    invoke-static {v4}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v14

    const-string v10, "LIFE"

    const/4 v11, 0x2

    const/high16 v13, 0x3f000000    # 0.5f

    invoke-direct/range {v9 .. v14}, Ljx1/t;-><init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V

    sput-object v9, Ljx1/t;->LIFE:Ljx1/t;

    new-instance v19, Ljx1/t;

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v15 .. v16}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v8

    new-instance v0, Li2/x;

    invoke-direct {v0, v8, v9}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v0}, [Ll83/k;

    move-result-object v22

    sget-wide v0, Li2/x;->m:J

    invoke-static {v0, v1}, Li91/c;->o(J)Li91/a;

    move-result-object v24

    const-string v20, "DISABLED"

    const/16 v21, 0x3

    const/high16 v23, 0x3f000000    # 0.5f

    invoke-direct/range {v19 .. v24}, Ljx1/t;-><init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V

    sput-object v19, Ljx1/t;->DISABLED:Ljx1/t;

    invoke-static {}, Ljx1/t;->$values()[Ljx1/t;

    move-result-object v0

    sput-object v0, Ljx1/t;->$VALUES:[Ljx1/t;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljx1/t;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ll83/k;",
            "F",
            "Li91/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljx1/t;->backgroundColors:[Ll83/k;

    iput p4, p0, Ljx1/t;->alpha:F

    iput-object p5, p0, Ljx1/t;->buttonBackground:Li91/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I[Ll83/k;FLi91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    .line 2
    new-array p3, p3, [Ll83/k;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x2

    if-eqz p3, :cond_1

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ljx1/t;-><init>(Ljava/lang/String;I[Ll83/k;FLi91/a;)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ljx1/t;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljx1/t;
    .locals 1

    const-class v0, Ljx1/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljx1/t;

    return-object p0
.end method

.method public static values()[Ljx1/t;
    .locals 1

    sget-object v0, Ljx1/t;->$VALUES:[Ljx1/t;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljx1/t;

    return-object v0
.end method


# virtual methods
.method public final getAlpha()F
    .locals 1

    iget v0, p0, Ljx1/t;->alpha:F

    return v0
.end method

.method public final getBackgroundColors()[Ll83/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ll83/k;"
        }
    .end annotation

    iget-object v0, p0, Ljx1/t;->backgroundColors:[Ll83/k;

    return-object v0
.end method

.method public final getButtonBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Ljx1/t;->buttonBackground:Li91/a;

    return-object v0
.end method
