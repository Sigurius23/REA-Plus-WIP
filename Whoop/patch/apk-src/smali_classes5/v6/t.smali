.class public final Lv6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/s;


# static fields
.field public static final a:Lv6/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv6/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv6/t;->a:Lv6/t;

    return-void
.end method


# virtual methods
.method public final a(Ln6/o;)Ln6/o;
    .locals 2

    new-instance v0, Lv6/v;

    sget-object v1, La7/b;->a:La7/b;

    invoke-direct {v0, v1}, Lv6/v;-><init>(La7/e;)V

    invoke-interface {p1, v0}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p1

    return-object p1
.end method
