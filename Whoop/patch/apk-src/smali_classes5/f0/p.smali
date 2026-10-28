.class public final synthetic Lf0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Li2/t;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Lk2/f;


# direct methods
.method public synthetic constructor <init>(Li2/t;JJLk2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/p;->w:Li2/t;

    iput-wide p2, p0, Lf0/p;->x:J

    iput-wide p4, p0, Lf0/p;->y:J

    iput-object p6, p0, Lf0/p;->z:Lk2/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lk2/c;

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v8, 0x0

    const/16 v9, 0x68

    iget-object v1, p0, Lf0/p;->w:Li2/t;

    iget-wide v2, p0, Lf0/p;->x:J

    iget-wide v4, p0, Lf0/p;->y:J

    const/4 v6, 0x0

    iget-object v7, p0, Lf0/p;->z:Lk2/f;

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
