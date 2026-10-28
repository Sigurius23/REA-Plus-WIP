.class public abstract Ll1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/b0;

    sget-object v1, Ll1/r;->w:Ll1/r;

    invoke-direct {v0, v1}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v0, Ll1/s;->a:Lp1/b0;

    return-void
.end method

.method public static final a()Lp1/b0;
    .locals 1

    sget-object v0, Ll1/s;->a:Lp1/b0;

    return-object v0
.end method
