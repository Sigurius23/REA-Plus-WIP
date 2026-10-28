.class public abstract Lcz/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcz/t0;->a:Z

    iput-boolean p2, p0, Lcz/t0;->b:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcz/t0;->a:Z

    return v0
.end method

.method public abstract b(Lc93/a;)Lb30/j3;
.end method
