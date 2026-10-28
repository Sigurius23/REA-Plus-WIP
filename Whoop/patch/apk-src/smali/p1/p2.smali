.class public abstract synthetic Lp1/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls/m2;

.field public static final b:Ls/m2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/m2;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ls/m2;-><init>(I)V

    sput-object v0, Lp1/p2;->a:Ls/m2;

    new-instance v0, Ls/m2;

    invoke-direct {v0, v1}, Ls/m2;-><init>(I)V

    sput-object v0, Lp1/p2;->b:Ls/m2;

    return-void
.end method
