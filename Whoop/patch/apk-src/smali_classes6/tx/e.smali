.class public final synthetic Ltx/e;
.super Lkotlin/jvm/internal/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ltx/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ltx/e;

    sget-object v4, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ltx/e;->w:Ltx/e;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "sanitize"

    return-object v0
.end method

.method public final getOwner()Lj93/f;
    .locals 3

    const-string v0, "wire-runtime"

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ltx/f;

    invoke-virtual {v1, v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lj93/f;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "sanitize(Ljava/lang/String;)Ljava/lang/String;"

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ls30/e;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
