.class public final Lwb3/o;
.super Llb3/n0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lwb3/k;


# direct methods
.method public constructor <init>(Lwb3/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb3/o;->a:Lwb3/k;

    return-void
.end method


# virtual methods
.method public final i0(Llb3/p0;Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lwb3/p;->w:Lwb3/p;

    invoke-virtual {p1, p2}, Lwb3/p;->f(Lob3/g;)Lob3/h;

    move-result-object p1

    check-cast p1, Lj93/a0;

    iget-object p2, p0, Lwb3/o;->a:Lwb3/k;

    invoke-virtual {p2, p1}, Lwb3/k;->a(Lj93/a0;)Lj93/d0;

    move-result-object p1

    iget-object p1, p1, Lj93/d0;->b:Lj93/a0;

    const-string p2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/a;

    return-object p1
.end method
