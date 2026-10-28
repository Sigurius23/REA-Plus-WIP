.class public final Lre/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lre/i0;

.field public c:Lre/z0;

.field public d:Lre/b1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lre/w0;
    .locals 1

    new-instance v0, Lre/w0;

    invoke-direct {v0, p0}, Lre/w0;-><init>(Lre/v0;)V

    return-object v0
.end method

.method public final b(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lre/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lre/i0;

    invoke-direct {p1, v0}, Lre/i0;-><init>(Lre/h0;)V

    iput-object p1, p0, Lre/v0;->b:Lre/i0;

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lre/v0;->a:Ljava/lang/String;

    return-void
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lre/y0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lre/z0;

    invoke-direct {p1, v0}, Lre/z0;-><init>(Lre/y0;)V

    iput-object p1, p0, Lre/v0;->c:Lre/z0;

    return-void
.end method

.method public final e(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lre/a1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lre/b1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/v0;->d:Lre/b1;

    return-void
.end method
