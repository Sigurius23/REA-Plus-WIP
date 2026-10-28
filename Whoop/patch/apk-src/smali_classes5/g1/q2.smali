.class public final Lg1/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/a0;


# direct methods
.method public constructor <init>(Lg1/r2;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v4, Lg1/p2;->c:Ld0/e2;

    new-instance v0, Lg1/a0;

    new-instance v2, Leg/j;

    const/16 v1, 0xf

    invoke-direct {v2, p0, v1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Ld1/i;

    const/16 v1, 0x16

    invoke-direct {v3, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lg1/a0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/a;Ld0/l;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lg1/q2;->a:Lg1/a0;

    return-void
.end method


# virtual methods
.method public final a()Ly3/c;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The density on DrawerState ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") was not set. Did you use DrawerState with the Drawer composable?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
