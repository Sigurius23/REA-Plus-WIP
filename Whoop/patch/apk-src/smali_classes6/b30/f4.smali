.class public final Lb30/f4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb30/g4;


# static fields
.field public static final a:Lb30/f4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb30/f4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb30/f4;->a:Lb30/f4;

    return-void
.end method


# virtual methods
.method public a(Lhc3/d;Lb30/y;Lb30/i1;Lh20/l1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lb30/m0;
    .locals 9

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb30/m0;

    const/4 v5, 0x1

    move-object v6, p1

    move-object v4, p2

    move-object v2, p3

    move-object v3, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lb30/m0;-><init>(Lb30/i1;Lh20/l1;Lb30/y;ZLbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method
