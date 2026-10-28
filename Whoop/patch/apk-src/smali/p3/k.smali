.class public abstract Lp3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/n0;

.field public static final b:La3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/n0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp0/n0;-><init>(I)V

    sput-object v0, Lp3/k;->a:Lp0/n0;

    new-instance v0, La3/p;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    sput-object v0, Lp3/k;->b:La3/p;

    return-void
.end method
