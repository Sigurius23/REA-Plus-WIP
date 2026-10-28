.class public final Ln6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Ln6/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln6/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln6/q;->w:Ln6/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ln6/n;

    instance-of v0, p2, Lw6/b;

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    return-object p1
.end method
