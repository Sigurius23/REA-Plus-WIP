.class public abstract Ls83/i;
.super Ls83/c;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/g;


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(ILq83/d;)V
    .locals 0

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    iput p1, p0, Ls83/i;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, Ls83/i;->arity:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ls83/a;->getCompletion()Lq83/d;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-super {p0}, Ls83/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
