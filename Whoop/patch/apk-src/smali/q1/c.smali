.class public final Lq1/c;
.super Ldt/b;
.source "SourceFile"


# instance fields
.field public final a:Lq1/l0;

.field public final b:Lq1/l0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq1/l0;

    invoke-direct {v0}, Lq1/l0;-><init>()V

    iput-object v0, p0, Lq1/c;->a:Lq1/l0;

    new-instance v0, Lq1/l0;

    invoke-direct {v0}, Lq1/l0;-><init>()V

    iput-object v0, p0, Lq1/c;->b:Lq1/l0;

    return-void
.end method
