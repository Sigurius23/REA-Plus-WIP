.class public abstract Lua3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsa3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lq1/j0;->c()Lsa3/b;

    move-result-object v0

    sput-object v0, Lua3/c;->a:Lsa3/b;

    return-void
.end method

.method public static a()Lsa3/b;
    .locals 1

    sget-object v0, Lua3/c;->a:Lsa3/b;

    return-object v0
.end method
