.class public abstract Lrb3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrb3/g;->a:Z

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Lio/getstream/video/android/model/User;
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lrb3/g;->a:Z

    return v0
.end method
