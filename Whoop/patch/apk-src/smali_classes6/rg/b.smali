.class public final Lrg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrg/c;
.implements Lq83/i;


# static fields
.field public static final w:Lrg/b;

.field public static final synthetic x:Lrg/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrg/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrg/b;->w:Lrg/b;

    new-instance v0, Lrg/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrg/b;->x:Lrg/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lgf/b;Lrg/d;)Lrg/f;
    .locals 0

    const-string p1, "initialAttributes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "spanKind"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lrg/h;->s:Lrg/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lrg/g;->b:Lrg/f;

    return-object p1
.end method
