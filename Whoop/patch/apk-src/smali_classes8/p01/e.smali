.class public final synthetic Lp01/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:Lp01/b;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lp01/b;JJJLp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp01/e;->w:Lp01/b;

    iput-wide p2, p0, Lp01/e;->x:J

    iput-wide p4, p0, Lp01/e;->y:J

    iput-wide p6, p0, Lp01/e;->z:J

    iput-object p8, p0, Lp01/e;->E:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v7, p0, Lp01/e;->E:Lp1/t2;

    move-object v8, p1

    check-cast v8, Lk2/e;

    iget-object v0, p0, Lp01/e;->w:Lp01/b;

    iget-wide v1, p0, Lp01/e;->x:J

    iget-wide v3, p0, Lp01/e;->y:J

    iget-wide v5, p0, Lp01/e;->z:J

    invoke-static/range {v0 .. v8}, Lp01/f;->c(Lp01/b;JJJLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
