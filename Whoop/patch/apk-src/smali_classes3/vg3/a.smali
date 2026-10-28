.class public final Lvg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final x:Lud3/h0;


# instance fields
.field public final w:Lcom/squareup/wire/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "application/x-protobuf"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Lvg3/a;->x:Lud3/h0;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/wire/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg3/a;->w:Lcom/squareup/wire/q;

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/squareup/wire/l;

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lvg3/a;->w:Lcom/squareup/wire/q;

    invoke-virtual {v1, v0, p1}, Lcom/squareup/wire/q;->encode(Lne3/i;Ljava/lang/Object;)V

    sget-object p1, Lvg3/a;->x:Lud3/h0;

    invoke-virtual {v0}, Lne3/h;->X0()Lne3/l;

    move-result-object v0

    invoke-static {p1, v0}, Lud3/v0;->create(Lud3/h0;Lne3/l;)Lud3/v0;

    move-result-object p1

    return-object p1
.end method
