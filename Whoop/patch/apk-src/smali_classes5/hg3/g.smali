.class public final Lhg3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lig3/d;


# instance fields
.field public final a:Lhg3/f;

.field public final b:Lbu/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhg3/f;

    invoke-direct {v0}, Lhg3/f;-><init>()V

    iput-object v0, p0, Lhg3/g;->a:Lhg3/f;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v0, Lbu/c;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lbu/c;-><init>(I)V

    iput-object v0, p0, Lhg3/g;->b:Lbu/c;

    return-void
.end method


# virtual methods
.method public final a()Lfg3/a;
    .locals 1

    iget-object v0, p0, Lhg3/g;->a:Lhg3/f;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final c()Lig3/b;
    .locals 1

    iget-object v0, p0, Lhg3/g;->b:Lbu/c;

    return-object v0
.end method
