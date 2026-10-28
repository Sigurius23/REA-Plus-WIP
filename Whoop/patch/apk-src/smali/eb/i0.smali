.class public final Leb/i0;
.super Leb/j1;
.source "SourceFile"


# instance fields
.field public final c:Leb/h0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leb/j1;-><init>()V

    new-instance v0, Leb/h0;

    invoke-direct {v0}, Leb/h0;-><init>()V

    iput-object v0, p0, Leb/i0;->c:Leb/h0;

    new-instance v0, Leb/t0;

    invoke-direct {v0, p0}, Leb/t0;-><init>(Leb/j1;)V

    invoke-virtual {p0, v0}, Leb/j1;->a(Leb/i1;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Leb/i1;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-super {p0, p1}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator"

    iget-object v0, p0, Leb/i0;->c:Leb/h0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
