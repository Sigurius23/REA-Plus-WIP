.class public abstract Lx6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx6/l;

    invoke-direct {v0}, Lx6/l;-><init>()V

    sput-object v0, Lx6/m;->a:Lx6/l;

    return-void
.end method

.method public static final a()Lx6/l;
    .locals 1

    sget-object v0, Lx6/m;->a:Lx6/l;

    return-object v0
.end method
