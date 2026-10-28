.class public abstract Lce3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lce3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lce3/n;->a:Lce3/m;

    return-void
.end method


# virtual methods
.method public a(Lce3/q;Lce3/d0;)V
    .locals 0

    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Lce3/y;)V
.end method
