.class public abstract Lz10/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz10/e;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lz10/e;->x:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lz10/e;->x:Z

    return v0
.end method

.method public abstract f()Lw10/d;
.end method

.method public getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz10/e;->w:Ljava/lang/String;

    return-object v0
.end method

.method public abstract h()Lf20/b;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract k()Ljava/lang/String;
.end method
