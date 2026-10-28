.class public final Lub3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# static fields
.field public static final w:Lub3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lub3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lub3/d;->w:Lub3/d;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
