.class public abstract Lr63/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr63/e;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public abstract c(Lq83/d;)Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
.end method
