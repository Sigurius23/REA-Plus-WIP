.class public final Lr83/e;
.super Ls83/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lq83/j;Lq83/d;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ls83/c;-><init>(Lq83/j;Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1
.end method
