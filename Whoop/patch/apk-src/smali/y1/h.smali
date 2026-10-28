.class public abstract Ly1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe1/h;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lwe1/h;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ly1/h;->a:Lp1/u2;

    return-void
.end method
