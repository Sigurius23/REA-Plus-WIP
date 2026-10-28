.class public abstract Lf0/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lf0/f1;->a:Lp1/b0;

    return-void
.end method
