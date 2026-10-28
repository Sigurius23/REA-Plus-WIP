.class public final Lsg3/a;
.super Lpg3/m;
.source "SourceFile"


# instance fields
.field public final a:Lud3/h0;

.field public final b:Lad3/z;


# direct methods
.method public constructor <init>(Lud3/h0;Lad3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg3/a;->a:Lud3/h0;

    iput-object p2, p0, Lsg3/a;->b:Lad3/z;

    return-void
.end method


# virtual methods
.method public final requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterAnnotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "methodAnnotations"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "retrofit"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lsg3/a;->b:Lad3/z;

    iget-object p3, p2, Lad3/z;->x:Ljava/lang/Object;

    check-cast p3, Lwc3/l;

    check-cast p3, Lad3/c;

    iget-object p3, p3, Lad3/c;->b:Lcd3/f;

    invoke-static {p3, p1}, Lvb/g;->h(Lcd3/f;Ljava/lang/reflect/Type;)Lwc3/c;

    move-result-object p1

    new-instance p3, Ls/m2;

    iget-object p4, p0, Lsg3/a;->a:Lud3/h0;

    check-cast p1, Lwc3/j;

    invoke-direct {p3, p4, p1, p2}, Ls/m2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "retrofit"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lsg3/a;->b:Lad3/z;

    iget-object p3, p2, Lad3/z;->x:Ljava/lang/Object;

    check-cast p3, Lwc3/l;

    check-cast p3, Lad3/c;

    iget-object p3, p3, Lad3/c;->b:Lcd3/f;

    invoke-static {p3, p1}, Lvb/g;->h(Lcd3/f;Ljava/lang/reflect/Type;)Lwc3/c;

    move-result-object p1

    new-instance p3, Lp0/n0;

    check-cast p1, Lwc3/b;

    const/4 v0, 0x4

    invoke-direct {p3, v0, p1, p2}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method
