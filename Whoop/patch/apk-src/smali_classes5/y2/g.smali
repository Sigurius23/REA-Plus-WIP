.class public abstract Ly2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ly2/f;->x:Ly2/f;

    new-instance v1, Lz2/h;

    invoke-direct {v1, v0}, Lz2/h;-><init>(Lc93/a;)V

    sput-object v1, Ly2/g;->a:Lz2/h;

    return-void
.end method

.method public static final a()Lz2/h;
    .locals 1

    sget-object v0, Ly2/g;->a:Lz2/h;

    return-object v0
.end method
