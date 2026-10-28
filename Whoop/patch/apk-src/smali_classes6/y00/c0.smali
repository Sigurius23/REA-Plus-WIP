.class public abstract Ly00/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public final w:Z

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly00/c0;->w:Z

    iput-object p2, p0, Ly00/c0;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract b()Ly00/y;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Ly00/c0;->w:Z

    return v0
.end method
