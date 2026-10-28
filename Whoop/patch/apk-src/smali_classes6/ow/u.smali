.class public final enum Low/u;
.super Low/x;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "LAZILY_PARSED_NUMBER"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lww/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lqw/i;

    invoke-virtual {p1}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lqw/i;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
