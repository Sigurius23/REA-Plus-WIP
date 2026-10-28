.class public final Ly6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/g;


# static fields
.field public static final a:Ly6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly6/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly6/h;->a:Ly6/h;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-static {p1, p2}, Ljc/x;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lp6/e1;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p2, v1}, Lp6/e1;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    const/4 p1, 0x7

    const/4 p2, 0x0

    invoke-static {p2, p2, v0, p1}, Lf6/c;->d(Ljava/util/List;Lhc3/d;Lc93/a;I)Lf6/b;

    move-result-object p1

    return-object p1
.end method
