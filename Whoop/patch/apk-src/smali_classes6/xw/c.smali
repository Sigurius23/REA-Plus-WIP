.class public abstract Lxw/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Low/n;

    invoke-direct {v0}, Low/n;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Low/n;->l:I

    const/4 v1, 0x1

    iput-boolean v1, v0, Low/n;->g:Z

    sget-object v1, Low/x;->y:Low/v;

    iput-object v1, v0, Low/n;->n:Low/x;

    const/4 v1, 0x0

    iput-boolean v1, v0, Low/n;->j:Z

    invoke-virtual {v0}, Low/n;->a()Low/m;

    return-void
.end method
