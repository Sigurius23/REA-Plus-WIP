.class public final Lrg/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrg/h;


# instance fields
.field public final w:Lrg/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lrg/c;->r:Lrg/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lrg/b;->w:Lrg/b;

    iput-object v0, p0, Lrg/f;->w:Lrg/b;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    sget-object v0, Lrg/e;->w:[Lrg/e;

    return-void
.end method

.method public final close()V
    .locals 0

    return-void
.end method
