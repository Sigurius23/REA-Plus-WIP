.class public final Lz1/g;
.super Lz1/q;
.source "SourceFile"


# instance fields
.field public final b:Lz1/b;


# direct methods
.method public constructor <init>(Lz1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/g;->b:Lz1/b;

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    iget-object v0, p0, Lz1/g;->b:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->c()V

    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;-><init>()V

    throw v0
.end method
