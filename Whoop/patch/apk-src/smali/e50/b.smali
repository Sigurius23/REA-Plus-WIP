.class public Le50/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static b:Le50/b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private a:Lp92/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le50/b;

    invoke-direct {v0}, Le50/b;-><init>()V

    sput-object v0, Le50/b;->b:Le50/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le50/b;
    .locals 1

    sget-object v0, Le50/b;->b:Le50/b;

    return-object v0
.end method


# virtual methods
.method public b()Lz82/b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lz82/b;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/b;

    return-object v0
.end method

.method public c()Lod1/f;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lod1/f;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/f;

    return-object v0
.end method

.method public d()Ltr2/n;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Ltr2/n;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method public e()Lu92/d;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lu92/d;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    return-object v0
.end method

.method public f()Lrd1/d;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lrd1/d;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrd1/d;

    return-object v0
.end method

.method public g()Lod1/u;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lod1/u;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/u;

    return-object v0
.end method

.method public h()Lod1/x;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lod1/x;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/x;

    return-object v0
.end method

.method public i(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lp92/f;

    invoke-direct {v0, p1}, Lp92/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Le50/b;->a:Lp92/f;

    return-void
.end method
