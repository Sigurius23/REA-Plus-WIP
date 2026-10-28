.class final Liw2/e$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liw2/e;->f(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whattoexpect.domain.WhatToExpectInteractor"
    f = "WhatToExpectInteractor.kt"
    l = {
        0x2c
    }
    m = "loadBffData"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Liw2/e;

.field y:I


# direct methods
.method public constructor <init>(Liw2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw2/e;",
            "Lq83/d<",
            "-",
            "Liw2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liw2/e$b;->x:Liw2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Liw2/e$b;->w:Ljava/lang/Object;

    iget p1, p0, Liw2/e$b;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Liw2/e$b;->y:I

    iget-object p1, p0, Liw2/e$b;->x:Liw2/e;

    invoke-static {p1, p0}, Liw2/e;->c(Liw2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
