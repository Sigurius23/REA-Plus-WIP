.class public abstract Lrb3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrb3/e;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrb3/w;->a:Lkotlin/jvm/functions/Function1;

    const-string p2, "must return "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lrb3/w;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lha3/e;)Z
    .locals 2

    iget-object v0, p1, Lu93/x;->H:Llb3/y;

    iget-object v1, p0, Lrb3/w;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge b(Lha3/e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lv8/b;->H(Lrb3/e;Lha3/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrb3/w;->b:Ljava/lang/String;

    return-object v0
.end method
