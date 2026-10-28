.class public abstract Lwz/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public final w:Ly00/c0;


# direct methods
.method public constructor <init>(Ly00/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwz/u0;->w:Ly00/c0;

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public h()Ly00/c0;
    .locals 1

    iget-object v0, p0, Lwz/u0;->w:Ly00/c0;

    return-object v0
.end method
